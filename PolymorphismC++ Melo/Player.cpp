#include <string>
#include <iostream>
#include "Player.h"

void Player::serviceName() {
	std::cout << "Player" << std::endl;
	return;
}
void Player::play() {
	std::cout << "Music Playing" << std::endl;
	return;
}
void Player::stopPlaying() {
	std::cout << "Stop player" << std::endl;
	return;
}