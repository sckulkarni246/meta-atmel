require linux.inc

FILESEXTRAPATHS_prepend := "${THISDIR}/${P}:"
PV = "5.15+git${SRCPV}"

KBRANCH = "linux-5.15-mchp"
SRC_URI = "git://github.com/sckulkarni246/linux.git;protocol=https;branch=${KBRANCH}"
SRC_URI_append_sam9x60 += "file://defconfig"
SRC_URI_append_sama5 += "file://defconfig"
SRCREV = "765617efd52bdda00d822a65d6aa1be2404ab625"
LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"

# Add greengrass fragment for SAMA5D2 platforms
SRC_URI_append_sama5d2 = "\
    file://gg.cfg \
"
KERNEL_MODULE_AUTOLOAD_append_sama5d27-wlsom1-ek-sd = " wilc-sdio"

COMPATIBLE_MACHINE = "(sama5d27-jupiter-nano-sd|sam9x60ek|sama5d27-som1-ek|sama5d27-wlsom1-ek-sd|sama5d2-icp-sd|sama7g5ek)"
