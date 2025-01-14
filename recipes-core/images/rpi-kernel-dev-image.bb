SUMMARY = "Raspberry Pi kernel development image"
LICENSE = "MIT"

inherit core-image

# taken from meta-raspberrypi rpi-test-image
IMAGE_INSTALL:append = " packagegroup-rpi-test"

# buildessential installs: gcc, make, autoconf, etc
CORE_IMAGE_EXTRA_INSTALL:append= " \
    packagegroup-core-buildessential \
"

# kernel dev tools
IMAGE_INSTALL:append = " \
    coreutils \
    dtc \
    i2c-tools \
    kernel-devsrc \
"

# extra dev tools
IMAGE_INSTALL:append = " \
    vim \
    ldd \
    file \
    gzip \
    wget \
    cmake \
    git \
    perf \
    openssh \
"

