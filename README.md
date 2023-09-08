# SOLUTIONS

•   data.txt: WELLDONE!
•   data0.txt: CMZ
•   data1.txt: 
•   data2.txt: WONDERFUL
•   data3.txt:

Solution proposed: 

# The-Great-Java-Code-Off

•	Teams of 3-4 will have 2 hrs to solve the problem.

•	Teams should fork the repo, and submit their solutions in their own repo by the deadline

•	The solution should be in Java, there are no other restrictions.

•	Teams are encouraged to let the more junior members write the code with seniors guiding.

•	After submissions, teams will have 3 mins to present their solutions,

•	Presentations should include showing the working solutions and talking about the coding choices teams made, including why things have been done a certain way.

•	Judges will get 3 mins to ask questions if they feel is necessary.

•	Teams will be assigned presentation slots in a random order.

•	After all teams have presented the Judges will pick a winner.

•	The use of the internet to look up syntax/language features is allowed. However, the use of ChatCPT/AI tools to produce the whole solution is not in the spirit of the competition.

# Judging Criteria

•   Does the solution produce the right answer (this is most important)

•   The Presentation, including how well teams explain their code.

•   Code Quality

•   Testing Quality

•   Scores will be weighted based on the teams' overall experience level (i.e. a team of 4 associates will be scored more favorably than a team of 4 seniors)


# The Challenge

An expedition can depart as soon as the final supplies have been unloaded from the ships. Supplies are stored in stacks of marked crates, but because the needed supplies are buried under many other crates, the crates need to be rearranged.
The ship has a giant cargo crane capable of moving crates between stacks. To ensure none of the crates get crushed or fall over, the crane operator will rearrange them in a series of carefully-planned steps. After the crates are rearranged, the desired crates will be at the top of each stack.
The boss doesn't want to interrupt the crane operator during this delicate procedure, but they forgot to ask which crate will end up where, and they want to be ready to unload them as soon as possible so they can embark.
They do, however, have a drawing of the starting stacks of crates and the rearrangement procedure (your puzzle input). For example:

||||
|--- | --- | ---|
||`D`||
|`N`|`C`||
|`Z`|`M`|`P`|
|1|2|3|

move 1 from 2 to 1

move 3 from 1 to 3

move 2 from 2 to 1

move 1 from 1 to 2

In this example, there are three stacks of crates. Stack 1 contains two crates: crate Z is on the bottom, and crate N is on top. Stack 2 contains three crates; from bottom to top, they are crates M, C, and D. Finally, stack 3 contains a single crate, P.
Then, the rearrangement procedure is given. In each step of the procedure, a quantity of crates is moved from one stack to a different stack. In the first step of the above rearrangement procedure, one crate is moved from stack 2 to stack 1, resulting in this configuration:

||||
|--- | --- | ---|
|`D`|||
|`N`|`C`||
|`Z`|`M`|`P`|
|1|2|3|

In the second step, three crates are moved from stack 1 to stack 3. Crates are moved one at a time, so the first crate to be moved (D) ends up below the second and third crates:

||||
|--- | --- | ---|
|||`Z`|
|||`N`|
||`C`|`D`|
||`M`|`P`|
|1|2|3|

Then, both crates are moved from stack 2 to stack 1. Again, because crates are moved one at a time, crate C ends up below crate M:

||||
|--- | --- | ---|
|||`Z`|
|||`N`|
|`M`||`D`|
|`C`||`P`|
|1|2|3|

Finally, one crate is moved from stack 1 to stack 2:

||||
|--- | --- | ---|
|||`Z`|
|||`N`|
|||`D`|
|`C`|`M`|`P`|
|1|2|3|

The boss just needs to know which crate will end up on top of each stack; in this example, the top crates are C in stack 1, M in stack 2, and Z in stack 3, so you should combine these together and give the workers the message CMZ.

Now using the input provided in the data file, along with the provided container ship layout, create a simple message after following the instructions in the file to move the crates.
As you remove each set of crates (1 from each pile), when the rearrangement procedure completes, what crate ends up on top of each stack? it should spell a sentence for the boss.

Shipping containers for Java exercise

**Ship 0 - Example**

*(See data0.txt file)*

||||
|--- | --- | ---|
||`D`||
|`N`|`C`||
|`Z`|`M`|`P`|
|1|2|3|

**Actual Ship To Be Unloaded**

*(See data.txt file)*

||||||||||
|---|---|---|---|---|---|---|---|---|
|||||`A`|`L`||`J`||
||||`B`|`Q`|`R`||`D`|`T`|
||||`G`|`H`|`H`|`M`|`N`|`E`|
|||`J`|`L`|`D`|`L`|`J`|`H`|`B`|
||`Q`|`L`|`W`|`S`|`V`|`N`|`F`|`N`|
|`W`|`N`|`H`|`M`|`L`|`B`|`R`|`T`|`Q`|
|`L`|`O`|`C`|`W`|`D`|`J`|`W`|`Z`|`E`|
|`S`|`J`|`S`|`T`|`O`|`M`|`D`|`!`|`H`|
|1|2|3|4|5|6|7|8|9|

# Extension Exercise

**Further ships to be unloaded - if you have the time or the will !!!**

**Ship 1**

*(See data1.txt file)*

||||||||||
|---|---|---|---|---|---|---|---|---|
|||||`B`|`L`||`J`||
||||`B`|`Q`|`R`||`D`|`T`|
||||`G`|`H`|`H`|`M`|`N`|`I`|
|||`J`|`T`|`D`|`N`|`J`|`H`|`B`|
||`Q`|`F`|`W`|`S`|`V`|`N`|`F`|`N`|
|`W`|`T`|`H`|`M`|`L`|`B`|`R`|`T`|`Q`|
|`L`|`T`|`C`|`F`|`A`|`J`|`W`|`Z`|`A`|
|`S`|`J`|`S`|`T`|`S`|`M`|`D`|`C`|`H`|
|1|2|3|4|5|6|7|8|9|

**Ship 2**

*(See data2.txt file)*

||||||||||
|---|---|---|---|---|---|---|---|---|
||`C`||||`L`|||`T`|
||`V`|`R`|`M`||`D`|||`B`|
||`N`|`G`|`F`|`Q`|`Q`|||`H`|
||`W`|`L`|`U`|`V`|`M`|`V`||`F`|
||`P`|`C`|`W`|`S`|`Z`|`B`|`O`|`L`|
|`G`|`R`|`M`|`B`|`F`|`J`|`S`|`Z`|`D`|
|`J`|`L`|`P`|`F`|`C`|`H`|`F`|`J`|`C`|
|`Z`|`Q`|`F`|`L`|`G`|`W`|`H`|`F`|`E`|
|1|2|3|4|5|6|7|8|9|

**Ship 3**

*(See data3.txt file)*

||||||||||
|---|---|---|---|---|---|---|---|---|
|`G`|||||`D`|`R`|||
|`W`|||`V`||`C`|`T`|`M`||
|`L`|||`P`|`Z`|`Q`|`F`|`V`||
|`J`|||`E`|`D`|`J`|`G`|`T`|`R`|
|`B`||`M`|`H`|`L`|`Z`|`J`|`B`|`L`|
|`R`|`Y`|`T`|`C`|`T`|`R`|`N`|`R`|`D`|
|`T`|`W`|`A`|`T`|`P`|`B`|`B`|`E`|`P`|
|`D`|`S`|`R`|`D`|`D`|`F`|`S`|`L`|`Q`|
|1|2|3|4|5|6|7|8|9|



