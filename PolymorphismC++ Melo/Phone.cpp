#include "Phone.h"
#include <string>
#include <iostream>

void Phone::placeCall() {
	std::cout << "Calling 9687-2733" << std::endl;
	return;
}
void Phone::receiveCall() {
	std::cout << "Receiving call" << std::endl;
	return;
}
void Phone::setVoiceVolume() {
	int phoneVolume = 0;
	std::cout << "Choose your volume from 1 to 10: " << std::endl;
	std::cin >> phoneVolume;
	return;
}
void Phone::declineCall() {
	std::cout << "Declining call" << std::endl;
	return;
}
void Phone::serviceName() {
	std::cout << "Phone" << std::endl;
	return;
}