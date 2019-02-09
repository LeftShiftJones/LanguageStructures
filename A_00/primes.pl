divisible(X,Y) :-
	N is Y*Y, 						% N=y^2
	N =< X, 						% and N <= X
	X mod Y =:= 0. 					% X % Y==0


divisible(X,Y) :-
	Y < X, 							% Confirm that y < x (otherwise not divisible in that order)
	Y1 is Y+1, 						% Used to iterate from [y,x]
	divisible(X,Y1).				% Run function to check if x is divisible by new y


isprime(X) :-
	Y is 2,							% Checks values from [2,X)
	X > 1,							% X must be smallest prime at minimum
	\+divisible(X,Y). 				% Return true if 'divisible' is not provable


primes(Lo,Hi,L) :-
	(Lo>Hi -> L=[];					% Hiase case: If Lo > Hi, return empty list
		(isprime(Lo) ->				% Else: If Lo is a prime number
				Lo1 is Lo+1,		% Increment Lo
				primes(Lo1, Hi, X),	% Run primes
				L = [Lo | X]		% L is a list with Lo added it
		;							% OTHERWISE
			Lo1 is Lo+1,			% Increment Lo
			primes(Lo1, Hi, L)		% Run primes with new Lo
		)
	).


isZero(X) :- 						% Is X Zero? Let's find out :thumbs_up:
	X = 0.


list_sum([],0).
list_sum([Head | Tail], TotalSum) :-
	list_sum(Tail, Sum1),
	TotalSum is Head + Sum1.


prime_partitions(Goal,Primes,List) :-
	(
	isZero(Goal) -> print(List), nl;
		(
		[H|T] = Primes,
		H =< Goal ->
			G is (Goal-H),
			L is [H|List],
			prime_partitions(G,T,L)
		;
			[H|T] = Primes,
			prime_partitions(Goal,T,List)
		)
	).


prime_partitions(Goal) :-
	primes(2,Goal,L),
	prime_partitions(Goal,L,[]).
