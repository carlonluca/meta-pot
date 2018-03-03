SUMMARY = "Minimal POT image"
HOMEPAGE = "http://thebugfreeblog.blogspot.it/2013/04/hardware-accelerated-qtmultimedia.html"

include recipes-core/images/rpi-test-image.bb

LICENSE_FLAGS_WHITELIST = "commercial oracle_java"
GPU_MEM = "256"

# Packages
# ========
UTILS = " \
    tree \
    nano \
    ffmpeg \
    userland \
    screen \
    e2fsprogs-resize2fs \
    libv4l \
    v4l-utils \
    boost \
    icu \
    log4cpp \
    alsa-utils \
    alsa-lib-dev \
    openssl \
    libxml2 \
    libxslt \
    freetype \
"

# openjre-8
# oracle-jse-jre

QT_TOOLS = " \
    qtbase \
    qtbase-dev \
    qtbase-mkspecs \
    qtbase-plugins \
    qtbase-tools \
"

FONTS = " \
    fontconfig \
    fontconfig-dev \
    fontconfig-utils \
    ttf-bitstream-vera \
"

QT_SERIALPORT = " \
    qtserialport-dev \
    qtserialport-mkspecs \
"

TSLIB = " \
    tslib \
    tslib-conf \
    tslib-calibrate \
    tslib-dev \
    tslib-tests \
"

QT5_PKGS = " \
    qtbase \
    qtbase-dev \
    qt3d \
    qt3d-dev \
    qt3d-mkspecs \
    qtcharts \
    qtcharts-dev \
    qtcharts-mkspecs \
    qtconnectivity-dev \
    qtconnectivity-mkspecs \
    qtdeclarative \
    qtdeclarative-dev \
    qtdeclarative-mkspecs \
    qtdeclarative-qmlplugins \
    qtgraphicaleffects \
    qtgraphicaleffects-dev \
    qtmultimedia \
    qtmultimedia-dev \
    qtmultimedia-mkspecs \
    qtquickcontrols2 \
    qtquickcontrols2-dev \
    qtquickcontrols2-mkspecs \
    qtserialbus \
    qtserialbus-dev \
    qtserialbus-mkspecs \
    qtsvg \
    qtsvg-dev \
    qtsvg-mkspecs \
    qtwebsockets-dev \
    qtwebsockets-mkspecs \
    qtwebsockets-qmlplugins \
    qtvirtualkeyboard \
    qtvirtualkeyboard-dev \
    qtxmlpatterns \
    qtxmlpatterns-dev \
    qtxmlpatterns-mkspecs \
    pot-plugin \
    qttools \
"

#    qtsensors-dev
#    qtsensors-mkspecs
#    qtsensors-plugins

SSHFS = " \
    openssh \
    openssh-sftp \
    openssh-sftp-server \
"

FFMPEG_LIBS = " \
    libavcodec \
    libavdevice \
    libavformat \
    libavutil \
    libpostproc \
    libswscale \
    libavfilter \
    libvpx \
    libopus \
    libwebp \
"

DEV = " \
    userspace-dev \
"

IMAGE_INSTALL += " \
    ${QT5_PKGS} \
    ${UTILS} \
    ${FONTS} \
    ${TSLIB} \
    ${SSHFS} \
    ${FFMPEG_LIBS} \
"
TOOLCHAIN_HOST_TASK += "nativesdk-cmake"

export IMAGE_BASENAME = "pot-minimal"
