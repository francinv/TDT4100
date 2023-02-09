package oving1;


public class LineEditor {
    private String text = "";
    private int insertionIndex = 0;

    public void left() {
        if (!(this.insertionIndex == 0)) {
            this.insertionIndex--;
        }
    }

    public void right() {
        if (this.insertionIndex < this.text.length()) {
            this.insertionIndex++;
        }
    }

    public void insertString(String s) {
        this.text = this.text.substring(0, this.insertionIndex) + s + (this.text.substring(this.insertionIndex));
        this.insertionIndex += s.length();
    }

    public void deleteLeft() {
        if (!(this.insertionIndex == 0)) {
            String stringToRemove = String.valueOf(this.text.charAt(this.insertionIndex - 1));
            this.text = this.text.replaceFirst(stringToRemove, "");
            this.insertionIndex -= 1;
        }
    }

    public void deleteRight() {
        if (this.insertionIndex < this.text.length()) {
            String stringToRemove;
            if (this.insertionIndex + 1 == this.text.length()) {
                System.out.println("if triggered");
                stringToRemove = String.valueOf(this.text.charAt(0));
            } else {
                stringToRemove = String.valueOf(this.text.charAt(this.insertionIndex));
                System.out.println(stringToRemove);
            }
            this.text = this.text.replaceFirst(stringToRemove, "");
            if (this.text.length() == 0) {
                this.insertionIndex = 0;
            }
        }
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getInsertionIndex() {
        return this.insertionIndex;
    }

    public void setInsertionIndex(int insertionIndex) {
        this.insertionIndex = insertionIndex;
    }

    @Override
    public String toString() {
        return this.text.substring(0, this.insertionIndex) + "|" + this.text.substring(this.insertionIndex);
    }

    public static void main(String[] args) {
        LineEditor lineEditor = new LineEditor();
        lineEditor.insertString("J");
        lineEditor.deleteLeft();
        System.out.println(lineEditor.getInsertionIndex());
        System.out.println(lineEditor.toString());
    }
}
