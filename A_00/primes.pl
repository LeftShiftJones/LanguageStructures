divisible(X,Y) :-
	N is Y*Y, 				% N=y^2
	N =< X, 				% and N <= X
	X mod Y =:= 0. 			% X % Y==0


divisible(X,Y) :-
	Y < X, 					% Confirm that y < x (otherwise not divisible in that order)
	Y1 is Y+1, 				% Used to iterate from [y,x]
	divisible(X,Y1).		% Run function to check if x is divisible by new y


isprime(X) :-
	Y is 2,					% Checks values from [2,X)
	X > 1,					% X must be smallest prime at minimum
	\+divisible(X,Y). 		% Return true if 'divisible' is not provable


primes(A,B,L) :-
	A < B+1,
	(
		isprime(A) -> 		% If A is a prime number
		L1 = [A | L], 		% New list L1 is A:L
		print(L1),			% Print out list
		nl,					% Newline for readability
		A1 is A+1, 			% Increment A
		primes(A1, B, L1) 	% Recurse with new variables
	;
		A1 is A+1,			% OTHERWISE: increment A
		primes(A1, B, L)	% Recurse with new variables
	).


primes(A,B) :-
	L = [],					% Empty list
	primes(A,B,L),			% Run primes function with new list
	print(L).
