package cards;

//chaque joueur doit avoir 3
//interdit de bloquer l’accès aux joyaux & d’encercler un joyau ou un autre joueur
public class Pierre extends Obstacles {
    public Pierre(){
        this.cardName ="Pierre Card";
        this.description="Permet de posser un obstacle";
    }


    public int[] playPierre() {
        int x;
        int y;
        return new int[x][y];
    }
}