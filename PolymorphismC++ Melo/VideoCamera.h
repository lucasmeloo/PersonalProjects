#pragma once
#include <string>
#include "Camera.h"

class VideoCamera:Camera {
public:
	void serviceName();
	void record();
	void stopRecording();
private:

};
