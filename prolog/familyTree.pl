/** Grant Commodore

This is a program that illustrates my family tree. 
It uses male, female, mother, father as a beginning, and adds 
10 people to your family. There are rules for mother, father, 
grandparent (or grandmother and grandfather), grandchild, parent,  
aunt, uncle, nephew, niece, cousin, sister, and brother. */ 

/** Family Members */
female(tarra).
female(nicki).
female(carolyn).
female(mercedes).
female(alisha).
female(olivia).
female(gabrielle).
female(savannah).
male(ross).
male(james).
male(richard).
male(rich).
male(bill).
male(christopher).
male(craig).
male(william).
male(xavier).
male(pierce).
male(liam).
male(elliot).
male(luke).

/** Family Member Relationships */
parent(tarra,grant).
parent(tarra,pierce).
parent(alisha,luke).
parent(alisha,savannah).
parent(nicki,xavier).
parent(nicki,gabrielle).
parent(olivia,liam).
parent(olivia,elliot).
parent(ross,grant).
parent(ross,pierce).
parent(james,luke).
parent(james,savannah).
parent(richard,liam).
parent(richard,elliot).
parent(craig,xavier).
parent(craig,gabrielle).
parent(carolyn,nicki).
parent(carolyn,tarra).
parent(carolyn,william).
parent(bill,nicki).
parent(bill,tarra).
parent(bill,william).
parent(mercedes,ross).
parent(mercedes,james).
parent(mercedes,richard).
parent(mercedes,christopher).
parent(rich,ross).
parent(rich,james).
parent(rich,richard).
parent(rich,christopher).
married(tarra,ross).
married(ross,tarra).
married(alisha,james).
married(james,alisha).
married(richard,olivia).
married(olivia,richard).
married(nicki,craig).
married(craig,nicki).
married(mercedes,rich).
married(rich,mercedes).
married(bill,carolyn).
married(carolyn,bill).

/** Family Member Rules */
mother(X,Y):- parent(X,Y),female(X).
father(X,Y):- parent(X,Y),male(X).

haschild(X):- parent(X,_).

sister(X,Y):- parent(Z,X),parent(Z,Y),female(X),X\==Y.
sisterinlaw(X,Y):- sister(X,Z),married(Z,Y).

brother(X,Y):-parent(Z,X),parent(Z,Y),male(X),X\==Y.
brotherinlaw(X,Y):- brother(X,Z),married(Z,Y).

cousin(X,Y):-parent(Z,X),parent(W,Y),sister(Z,W).
cousin(X,Y):-parent(Z,X),parent(W,Y),brother(Z,W).

aunt(X,Y):-parent(Z,Y),sister(X,Z).
aunt(X,Y):-parent(Z,Y),sisterinlaw(X,Z).
aunt(X,Y):-female(X),parent(X,Z),cousin(Y,Z).

uncle(X,Y):-parent(Z,Y),brother(X,Z).
uncle(X,Y):-parent(Z,Y),brotherinlaw(X,Z).
uncle(X,Y):-male(X),parent(X,Z),cousin(Y,Z).

niece(X,Y):-aunt(Y, X).
niece(X,Y):-uncle(Y, X).

nephew(X,Y):-aunt(Y, X).
nephew(X,Y):-uncle(Y, X).

grandparent(X,Y):-parent(X,Z),parent(Z,Y).