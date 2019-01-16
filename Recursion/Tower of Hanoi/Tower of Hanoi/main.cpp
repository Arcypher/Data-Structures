#include <iostream>
#include <string>

/**
*	Handles the Tower of Hanoi algorithm. Mathematical puzzle consisting of three towers
*	with all disks on the source towerfrom largest to smallest from bottom to top.
*	End goal is to have the destination tower to have the disks go up in a cone shape.
*
*	Params:
*	-numDisks: number of user-inputted disks
*	-sourceTower: Tower from where all the disks are
*	-auxTower: Auxilary tower to act as temp storage for disks
*	-destTower: Final Tower and where the result should be a tower just as the former source tower.
*
*	References and sources: GeeksForGeeks and "Data Structures and Algorithms Made Easy"
*/
void towerOfHanoi(int numDisks, char sourceTower, char auxTower, char destTower) {
	//Since it is printing out here, no need for referencing

	//If first disk, move.
	if (numDisks == 1) {
		std::cout << "Move disk 1 from rod " << sourceTower << " to rod " << destTower << std::endl;
		return;
	}

	//Move numDisks - 1 from A to B, C is the aux. tower
	towerOfHanoi(numDisks - 1, sourceTower, destTower, auxTower);

	std::cout << "Move disk " << numDisks << " from rod " << sourceTower << " to rod " << destTower << std::endl;

	//Move numDisks -1 from B to C, A is the aux. tower
	towerOfHanoi(numDisks - 1, auxTower, sourceTower, destTower);
}

/**
*	Driver of program
*
*/
int main() {
	int numDisks;
	std::cout << "Enter the number of disks you want: ";
	std::cin >> numDisks;
	towerOfHanoi(numDisks, 'A', 'B', 'C');
	system("pause");
	return 0;
}