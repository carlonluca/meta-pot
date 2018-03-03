SUMMARY = "Minimal POT image"
HOMEPAGE = "http://thebugfreeblog.blogspot.it/2013/04/hardware-accelerated-qtmultimedia.html"

include pot-minimal.bb

GST = " \
	gstreamer1.0 \
	gstreamer1.0-omx \
	gstreamer1.0-plugins-base \
	gstreamer1.0-plugins-good \
"	

IMAGE_INSTALL += " \
	hyphen \
	openjre-8 \
	${GST} \
"