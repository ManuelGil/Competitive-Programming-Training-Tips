mergesort([],[]).
mergesort([X],[X]).
mergesort(List, SortedList):- divide(List, List1, List2), mergesort(List1, Sorted1),
    mergesort(List2, Sorted2),merge(Sorted1, Sorted2, SortedList).

divide([],[],[]).
divide([X],[X],[]).
divide([X,Y|L],[X|L1],[Y|L2]):- divide(L,L1,L2).

merge([],L,L).
merge([H|T],L,N):-insert(H,L,R),merge(T,R,N).

insert(X,[],[X]).
insert(X,[H|T],[X,H|T]):-X=<H.
insert(X,[H|T],[H|N]):-X>H,insert(X,T,N).
