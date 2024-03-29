package mastermind;

class ProposedCombination extends Combination {

    ProposedCombination() {
        super();
    }

    void write() {
        for (Color color : this.colors) {
            color.write();
        }
    }

    void read() {
        Error error;
        do {
            error = null;
            Message.PROPOSED_COMBINATION.write();
            String characters = this.console.readString();
            if (characters.length() != Combination.getWidth()) {
                error = Error.WRONG_LENGTH;
            } else {
                for (int i = 0; i < characters.length(); i++) {
                    Color color = Color.getInstance(characters.charAt(i));
                    if (color == null) {
                        error = Error.WRONG_CHARACTERS;
                    } else {
                        for (int j = 0; j < i; j++) {
                            if (this.colors[j] == null) {
                            } 
                            if (color == this.colors[i]) {
                                error = Error.DUPLICATED;
                            }
                        }
                        if (error == null) {
                            this.colors[i] = color;
                        } 
                    }
                }
            }
            if (error != null) {
                error.writeln();
                for (int i = 0; i < this.colors.length; i++) {
                    this.colors[i] = null;
                }
            }
        } while (error != null);

    }

    boolean contains(Color color, int position) {
        return this.colors[position] == color;
    }

    boolean contains(Color color) {
        for (int i = 0; i < this.colors.length; i++) {
            if (this.colors[i] == color) {
                return true;
            }
        }
        return false;
    }

}
