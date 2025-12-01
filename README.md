Towers Of Hanoi Solver
Rules:
a) There are three Pillars (Pillar1, Pillar2, Pillar3).
b) There are N number of disks of increasing size (disk size is indicated by an integer).
c) At the start, all disks are stacked on one of the pillars.
d) At no point can a disk of larger size be placed above a disk of smaller size (including
the start state).
e) You have to move all disks from the start pillar to a target pillar.
f) Only one disk can be moved at a time.
Note: You can change the parameters: number of disks, staring and ending disk.
Sample Run:
Hanoi mySolver = new Hanoi(3,1,3);
//the first parameter is the number of disks
//the second parameter is the start pillar
//the third parameter is the target
The output should be:
My Solution is:
t0 Pillar1: 3 2 1
t0 Pillar2:
t0 Pillar3:
t1 Pillar1: 3 2
t1 Pillar2:
t1 Pillar3: 1
t2 Pillar1: 3
t2 Pillar2: 2
t2 Pillar3: 1
t3 Pillar1: 3
t3 Pillar2: 2 1
t3 Pillar3:
t4 Pillar1:
t4 Pillar2: 2 1
t4 Pillar3: 3
t5 Pillar1: 1
t5 Pillar2: 2
t5 Pillar3: 3
t6 Pillar1: 1
t6 Pillar2:
t6 Pillar3: 3 2
t7 Pillar1:
t7 Pillar2:
t7 Pillar3: 3 2 1
