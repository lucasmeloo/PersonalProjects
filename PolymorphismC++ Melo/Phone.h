#pragma once
#include <string>
#include "Service.h"

class Phone:Service {
public:
	void placeCall();
	void receiveCall();
	void setVoiceVolume();
	void declineCall();
	void serviceName();
private:

};

