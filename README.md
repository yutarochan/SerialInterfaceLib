Serial Interface Library
========================

<h3>Execution Notes</h3>
The following execution notes is for the Linux Environment Only!
- Final execution environment of program will be on a 64-bit based Linux System.
- Copy librxtxSerial.so binary under jre dependecies to avoid UnlinkErrors.
- Establish a symlink between the USB and the device using the following commands:
    '''
    cd /dev
    sudo ln -s ttyACM0 ttyUSB0
    '''
The above source must be written in during boot sequence of the operating system.
- Run as sudo to ensure that you can access the Serial Ports.
