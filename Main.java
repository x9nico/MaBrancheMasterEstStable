import *;

public class Main extends GravenPlugin implements GravListener {

     @Override
     public void onEnable(){
          getServer().getPluginManager().registerEvents(this, this);
     }
     
     @EventHandler
     public void join(GravenJoinEvent e){
          Graven graven = e.getGraven();
          graven.sendMessage("Bravo, tu es graven");
     }
 }
