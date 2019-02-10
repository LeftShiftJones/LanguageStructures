divisible(X,Y) :-
	N is Y*Y, 						% N=y^2
	N =< X, 						% and N <= X (If Y^2 is greater than x,
									% then Y >= sqrt(X), which is where we end execution in other programs)
	X mod Y =:= 0. 					% X % Y==0


divisible(X,Y) :-
	Y < X, 							% Confirm that y < x (ELSE not divisible in that order)
	Y1 is Y+1, 						% Used to iterate from [y,x]
	divisible(X,Y1).				% Run function to check if x is divisible by new y


isprime(X) :-
	Y is 2,							% Checks values from [2,X)
	X > 1,							% X must be smallest prime at minimum
	\+divisible(X,Y). 				% Return true if 'divisible' is not provable


primes(Lo,Hi,L) :-
	(Lo>Hi -> L=[];					% Base case: If Lo > Hi, return empty list
		(isprime(Lo) ->				% Else: If Lo is a prime number
				Lo1 is Lo+1,		% Increment Lo
				primes(Lo1, Hi, X),	% Run primes
				L = [Lo | X]		% L is a list with Lo added it
		;							% ELSE
			Lo1 is Lo+1,			% Increment Lo
			primes(Lo1, Hi, L)		% Run primes with new Lo
		)
	).


list_sum([],0).						% Base case of List sum: empty list just returns
list_sum([Head | Tail], TotalSum) :-
	list_sum(Tail, Sum),			% Run listsum on next value
	TotalSum is Head + Sum.		    % return sum value (builds from the bottom recursively)


print_sum([H | T]) :-
	T=[] -> 						% If tail is empty (H is last element)
		write(H),					% Write element to console
		nl							% Write newline character
	;								% ELSE
		write(H),					% Write element
		write(' + '),				% ... and following '+'
		print_sum(T).				% Recurse through list'


% This function found on the web, how to reverse a list:
% https://stackoverflow.com/questions/19471778/reversing-a-list-in-prolog
% Used only for printing our final lists, not used to find solutions
%
% Works by appending head of list to another list, which recursion
% makes a reversed list. Base case returns the new list

reverse([],Z,Z).					% Base Case: return list
reverse([H|T],Z,Acc) :-
	reverse(T,Z,[H|Acc]).			% Append head to Acc


prime_partitions(Goal,Primes,List) :-
	list_sum(List,Total),			% Get sum of list
	Total=Goal ->					% If sum(list) == goal
		reverse(List,L,[]),			% Reverse list to print in ascending order
		print_sum(L)				% Print_sum function
	;								% Else
	Primes=[]->!;					% If primes list is empty end execution
	[H|T] = Primes,					% Get head, tail from Primes
	L1 = [H|List],					% Append to new List
	prime_partitions(Goal,T,L1),	% Recurse with new element in List
	prime_partitions(Goal,T,List). 	% Recurse without new element in List



main(Goal) :-
	primes(2,Goal,L),				% Get Primes list (stores to L)
	prime_partitions(Goal,L,[]).	% Run prime partitions with given parameters
