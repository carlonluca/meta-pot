SUMMARY = "PiOmxTextures"
DESCRIPTION = "This package contains the POT plugin"
HOMEPAGE = "http://thebugfreeblog.blogspot.it/p/overview-of.html"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=c46082167a314d785d012a244748d803"

DEPENDS = "qtmultimedia ffmpeg v4l-utils boost libpcre libav virtual/egl boost freetype dbus openssl samba libssh libomxil coreutils-native curl-native"

SRC_URI = "gitsm://github.com/carlonluca/pot.git;protocol=http;branch=yocto"
SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git"

require recipes-qt/qt5/qt5.inc

do_install_append() {
    rm -f ${D}/usr/lib/qt5/plugins/mediaservice/libopenmaxilmediaplayer.so.1.0
    rm -f ${D}/usr/lib/qt5/plugins/mediaservice/libopenmaxilmediaplayer.so.1
    rm -f ${D}/usr/lib/qt5/plugins/mediaservice/libopenmaxilmediaplayer.so
}

FILES_${PN} += "${libdir}/qt5/plugins/mediaservice/libopenmaxilmediaplayer.so.1.0.0"