#include "Service.h"
#include <iostream>

void Service::serviceName() {
	std::cout << "Device" << std::endl;
	return;
}
string Service::provider() {
	return "Provider";
}
bool Service::useKeyboard() {
	return false;
}
void Service::can() {
	return;
}