KV = "3.14-1.17"
DRIVERDATE = "20181127"

require dreambox-dvb-modules-new.inc

SRC_URI[dm920.md5sum] = "ff7b06d5bab91d9734d2a302ad43a49a"
SRC_URI[dm920.sha256sum] = "07ec4d7d4707e83e95f308aac17d722a492933994473288f4316af1833a10895"

COMPATIBLE_MACHINE = "dm920"

MD5SUM = "${@d.getVarFlag('SRC_URI', 'dm920.md5sum', True)}"
