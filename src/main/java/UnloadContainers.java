import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Stack;
import java.util.logging.Logger;


public class UnloadContainers {

    /*
     Starting container arrangement

                    [A] [L]     [J]
                [B] [Q] [R]     [D] [T]
                [G] [H] [H] [M] [N] [E]
            [J] [L] [D] [L] [J] [H] [B]
        [Q] [L] [W] [S] [V] [N] [F] [N]
    [W] [N] [H] [M] [L] [B] [R] [T] [Q]
    [L] [O] [C] [W] [D] [J] [W] [Z] [E]
    [S] [J] [S] [T] [O] [M] [D] [!] [H]
     1   2   3   4   5   6   7   8   9

     */

    private static final Logger logger=Logger.getLogger(UnloadContainers.class.getName());
    public static void main(String[] args) throws IOException {


        //setUpData0ContainerShip(stacks);

        String instructions = System.getProperty("user.dir")+"\\src\\main\\resources\\data.txt";
        String[] arr = getInstructionsFromFile(instructions);

        //Create container ship
        final int numberOfStacks = 9;
        Stack[] stacks = initialiseStacks(numberOfStacks);
        setUpDataContainerShip(stacks);
        //setUpData2ContainerShip(stacks);
        //setUpData0ContainerShip(stacks);

        //Process containers
        for(int i=0; i<numberOfStacks; i++) {

            String[] instruction = arr[i].split(" ");
            int numberOfIterationOnStack = Integer.parseInt(instruction[1]);
            int stackToPop = Integer.parseInt(instruction[3])-1;
            int stackToPush = Integer.parseInt(instruction[5])-1;

            for(int j = 0; j < numberOfIterationOnStack; j++){
                if(stacks[stackToPop].empty())
                {
                    logger.info("Stack is empty nothing to push");
                }
                else {
                    stacks[stackToPush].push(stacks[stackToPop].pop());
                }
            }
        }
        //Reveal message
        for (Stack<Character> stack: stacks) {
            System.out.print(stack.peek().toString());
        }

    }

    private static void setUpDataContainerShip(Stack<Character>[] stacks){
        stacks[0].push('S');
        stacks[0].push('L');
        stacks[0].push('W');

        stacks[1].push('J');
        stacks[1].push('O');
        stacks[1].push('N');
        stacks[1].push('Q');

        stacks[2].push('S');
        stacks[2].push('C');
        stacks[2].push('H');
        stacks[2].push('L');
        stacks[2].push('J');

        stacks[3].push('T');
        stacks[3].push('W');
        stacks[3].push('M');
        stacks[3].push('W');
        stacks[3].push('L');
        stacks[3].push('G');
        stacks[3].push('B');

        stacks[4].push('O');
        stacks[4].push('D');
        stacks[4].push('L');
        stacks[4].push('S');
        stacks[4].push('D');
        stacks[4].push('H');
        stacks[4].push('Q');
        stacks[4].push('A');

        stacks[5].push('M');
        stacks[5].push('J');
        stacks[5].push('B');
        stacks[5].push('V');
        stacks[5].push('L');
        stacks[5].push('H');
        stacks[5].push('R');
        stacks[5].push('L');

        stacks[6].push('D');
        stacks[6].push('W');
        stacks[6].push('R');
        stacks[6].push('N');
        stacks[6].push('J');
        stacks[6].push('M');

        stacks[7].push('!');
        stacks[7].push('Z');
        stacks[7].push('T');
        stacks[7].push('F');
        stacks[7].push('H');
        stacks[7].push('N');
        stacks[7].push('D');
        stacks[7].push('J');

        stacks[8].push('H');
        stacks[8].push('E');
        stacks[8].push('Q');
        stacks[8].push('N');
        stacks[8].push('B');
        stacks[8].push('E');
        stacks[8].push('T');

    }

    private static void setUpData2ContainerShip(Stack<Character>[] stacks){
        stacks[0].push('Z');
        stacks[0].push('J');
        stacks[0].push('G');

        stacks[1].push('Q');
        stacks[1].push('L');
        stacks[1].push('R');
        stacks[1].push('P');
        stacks[1].push('W');
        stacks[1].push('N');
        stacks[1].push('V');
        stacks[1].push('C');

        stacks[2].push('F');
        stacks[2].push('P');
        stacks[2].push('M');
        stacks[2].push('C');
        stacks[2].push('L');
        stacks[2].push('G');
        stacks[2].push('R');


        stacks[3].push('L');
        stacks[3].push('F');
        stacks[3].push('B');
        stacks[3].push('W');
        stacks[3].push('U');
        stacks[3].push('F');
        stacks[3].push('M');

        stacks[4].push('G');
        stacks[4].push('C');
        stacks[4].push('F');
        stacks[4].push('S');
        stacks[4].push('V');
        stacks[4].push('Q');

        stacks[5].push('W');
        stacks[5].push('H');
        stacks[5].push('J');
        stacks[5].push('Z');
        stacks[5].push('M');
        stacks[5].push('Q');
        stacks[5].push('D');
        stacks[5].push('L');

        stacks[6].push('H');
        stacks[6].push('F');
        stacks[6].push('S');
        stacks[6].push('B');
        stacks[6].push('V');

        stacks[7].push('F');
        stacks[7].push('J');
        stacks[7].push('Z');
        stacks[7].push('O');

        stacks[8].push('E');
        stacks[8].push('C');
        stacks[8].push('D');
        stacks[8].push('L');
        stacks[8].push('F');
        stacks[8].push('H');
        stacks[8].push('B');
        stacks[8].push('T');
    }

    private static void setUpData0ContainerShip(Stack<Character>[] stacks){
        stacks[0].push('Z');
        stacks[0].push('N');

        stacks[1].push('M');
        stacks[1].push('C');
        stacks[1].push('D');

        stacks[2].push('P');

    }

    private static Stack[] initialiseStacks(int numberOfStacks){
        Stack<Character>[] stacks = new Stack[numberOfStacks];
        for (int i = 0; i < numberOfStacks; i++) {
            stacks[i] = new Stack<>();
        }
        return stacks;
    }
    private static String[] getInstructionsFromFile(String filePath) throws IOException {
        Path myPath = Paths.get(filePath);
        List<String> lines = Files.readAllLines(myPath, StandardCharsets.UTF_8 );
        return lines.toArray(new String[lines.size()]);
    }
}
