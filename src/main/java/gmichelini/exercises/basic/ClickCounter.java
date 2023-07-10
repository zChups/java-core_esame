package gmichelini.exercises.basic;

public class ClickCounter {
    int clicked;

    public ClickCounter() {
        this.clicked = 0;
    }

    public int getClicked() {
        return clicked;
    }

    public void setClicked(int clicked) {
        this.clicked = clicked;
    }

    public void click(){
        clicked += 1;
    }

    public void undo(){
        this.clicked = (clicked <= 0) ? 0 : clicked - 1;
    }
    public void reset(){
        this.clicked = 0;
    }
}
