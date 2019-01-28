package v1;
public class Game
{
    private Room aCurrentRoom; // room courante
    private Parser aParser;//Parser
    private void createRooms(){
        // ## déclaration des rooms ##
        Room vOutside = new Room("outside the main entrance of the university");
        Room vTheatre = new Room("in a lecture theatre");
        Room vPub = new Room("in a campus pub");
        Room vLab = new Room("in a computing lab");
        Room vOffice = new Room("in the computing admin office");
        
        // ## déclaration des sorties ##
        vOutside.setExits( null , vTheatre , vLab , vPub );
        vTheatre.setExits( null , null , null , vOutside );
        vPub.setExits( null , vOutside , null , null );
        vLab.setExits( vOutside , vOffice , null , null );
        vOffice.setExits( null , null , null , vLab );
        
        // ## initialisation du lieu courant ##
        this.aCurrentRoom = vOutside;
    }//creatRoom()
    
    public Game (){
        createRooms();
        this.aParser = new Parser();
    }//Game()
    
    private void goRoom ( final Command pCommand){
        
        if ( ! pCommand.hasSecondWord()){
            System.out.println("Go where ?");
            return;
        } //mot pas bon apres le go
        else {
        
            Room vNextRoom = null;
            
            String vDirection = pCommand.getSecondWord();
            
            if (vDirection.equals("North")){
                vNextRoom = this.aCurrentRoom.aNorthExit ;
            } else if (vDirection.equals("East")){
                vNextRoom = this.aCurrentRoom.aEastExit ;
            } else if (vDirection.equals("South")){
                vNextRoom = this.aCurrentRoom.aSouthExit ;
            } else if (vDirection.equals("West")){
                vNextRoom = this.aCurrentRoom.aWestExit ;
            } else {
                System.out.println("Unknown direction !");
                return;
            }//directions apres le go
            
            if (vNextRoom == null){
                System.out.println("There is no door !");
            } else {
                this.aCurrentRoom = vNextRoom;
                System.out.println("You are "+vNextRoom.getDescription());
                System.out.print("Exits : ");
                if (this.aCurrentRoom.aEastExit != null){
                    System.out.print("East ");
                }
                if (this.aCurrentRoom.aNorthExit !=null){
                    System.out.print("North ");
                }
                if (this.aCurrentRoom.aSouthExit != null){
                    System.out.print("South ");
                }
                if (this.aCurrentRoom != null){
                    System.out.print("West ");
                }
            }
        }
    }//goRoom(.)
    
    private void printWelcome(){
                System.out.println("Welcome to the World of Zuul !");
                System.out.println("World of Zuul il a new, incredibly boring adventure game.");
                System.out.println("Type'help' if you need help.");
                System.out.println('\n');
                System.out.println("You are " + this.aCurrentRoom.getDescription());
                System.out.print("Exits : ");
             if ( this.aCurrentRoom.aEastExit != null){
                    System.out.print("East ");
                }
             if ( this.aCurrentRoom.aNorthExit != null){
                    System.out.print("North ");
                }
             if ( this.aCurrentRoom.aSouthExit != null){
                    System.out.print("South ");
                }
             if (this.aCurrentRoom.aSouthExit != null){
                    System.out.print("West ");
                }
            }//printWelcome() 
        
    private void printHelp(){
        System.out.println("You are lost. You are alone");
        System.out.println("You wander around at the university");
        System.out.println('\n');
        System.out.println("Your command words are :");
        System.out.println("  go quit help");
    }//printHelp()
        
    private boolean quit (final Command pCommand){
        if (! pCommand.hasSecondWord()){
            System.out.println("Quit what ?");
        }
        return pCommand.hasSecondWord();
    }//quit()
    
    private boolean processCommand (final Command pCommand){
        if ( pCommand.isUnknown()){
            System.out.println("I don't know what you mean");
            return false;
        }
        String vCommandWord = pCommand.getCommandWord();
        if (vCommandWord.equals("go")){
            goRoom(pCommand);
            return false;
        } else if (vCommandWord.equals("help")){
            printHelp();
            return false;
        } else if (vCommandWord.equals("quit")){
            return quit(pCommand);
        } else {
            return false;
        }
    }
    /*private void son() {
	SoundClip clip = new SoundClip("sonsw.mp3");
	clip.setVolume(1);
	clip.play();*/
//}

    public void play(){
        Command vCommand;
        
        printWelcome();
        boolean vFinished = false ;
        while (vFinished == false){
            vCommand = this.aParser.getCommand();
            vFinished = this.processCommand(vCommand);
        }//while()
        System.out.println("Thank you for playing. Good bye.");
    }

} // Game
