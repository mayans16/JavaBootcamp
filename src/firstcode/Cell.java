package firstcode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Cell {
    private int strength;
    private int x;
    private int y;
    private int id;

    public HashMap<String, Integer> concentrations = new HashMap<String, Integer>();
    public HashSet<String> signalMolecules = new HashSet<String>();
    private ArrayList<Cell> neighbors = new ArrayList<Cell>();

    public Cell(){
        this.strength = 0;
        this.id = 0;
        this.x = 0;
        this.y = 0;
    }

    public Cell(int strength, int x, int y, int id){
        this.setStrength(strength);
        this.setX(x);
        this.setY(y);
        this.setId(id);
    }

    public int getStrength(){
        return this.strength;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public int getId(){
        return this.id;
    }

    public void setStrength(int strength){
        if (strength > 0){
            this.strength = strength;
        }
        else{
            this.strength = 0;
        }
    }

    public void setX(int x){
        if (x > 0){
            this.x = x;
        }
        else{
            this.x = 0;
        }
    }

    public void setY(int y){
        if (y > 0){
            this.y = y;
        }
        else{
            this.y = 0;
        }
    }

    public void setId(int id){
        if (id > 0){
            this.id = id;
        }
        else{
            this.id = 0;
        }
    }

    private void life(){
        if (neighbors.size() > 6){

        }
    }

    public void interactNeighbors(ArrayList<Cell> neighbors){

    }
}
