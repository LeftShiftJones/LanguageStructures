with Ada.Text_IO, Ada.Integer_Text_IO, Ada.IO_Exceptions;
use Ada.Text_IO, Ada.Integer_Text_IO, Ada.IO_Exceptions;

procedure Primes is

    type Prime_List is array (Positive range <>) of Integer;
    N : Integer;
    Empty : Prime_List (1..0) := (others => -1);

    -- HELPER FUNCTIONS
    -- Print a list
    procedure Print_List(List : Prime_List) is
    begin
        for i in List'First..(List'Last-1) loop
            Put(Integer'Image(List(i)) & " +");
        end loop;
        Put(Integer'Image(List(List'Last)));
        New_Line;
    end Print_List;

    -- LOGIC
    -- Check to see if number is prime, start with 2
    function Is_Prime(N : Integer; Check : Integer := 2) return Boolean is   
    begin
        if (Check * Check) > N then
            return True;
        elsif N mod Check = 0 then
            return False;
        end if;

        return Is_Prime(N, Check + 1);
    end Is_Prime;

    -- Create list of prime numbers in range 2..Finish
    function Primes_List(Start : Integer; Finish : Integer) return Prime_List is
        X : Prime_List (Start..Finish) := (others => -1);
        Start_Prime_Index : Integer := -1;
        End_Prime_Index : Integer := Start;
    begin
        -- generate a list of primes
        for i in Start..Finish loop
            if Is_Prime(i) then
                X(End_Prime_Index) := i;
                if (Start_Prime_Index = -1) then Start_Prime_Index := i; end if;
                End_Prime_Index := End_Prime_Index + 1;
            end if;
        end loop;

        -- clean up
        return X(Start_Prime_Index..End_Prime_Index-1);
    end Primes_List;

    -- Find the sum of a list
    function Sum(List : Prime_List) return Integer is
        Val : Integer := 0;
    begin
        for i in List'First..List'Last loop
            Val := Val + List(i);
        end loop;

        return Val;
    end Sum;

    -- Find solutions
    procedure Prime_Partitions(N : Integer; List_Of_Primes : Prime_List; Solution : Prime_List) is
    begin
        if Sum(Solution) = N then Print_List(Solution);
        elsif List_Of_Primes'Length = 0 then NULL;
        else 
            Prime_Partitions(N, List_Of_Primes(List_Of_Primes'First+1..List_Of_Primes'Last), Solution & List_Of_Primes(List_Of_Primes'First));
            Prime_Partitions(N, List_Of_Primes(List_Of_Primes'First+1..List_Of_Primes'Last), Solution);
        end if;
    end Prime_Partitions;
begin

    Put("Enter a number (non-number to quit): ");
    Get(N);
    Prime_Partitions(N, Primes_List(2, N), Empty);
    
    exception
        when Ada.IO_Exceptions.Data_Error => 
            Put("Bye!");
            return;
end Primes;