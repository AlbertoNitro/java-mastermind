package mastermind;

class ProposedCombinationBuilder {

    private String characters;

    ProposedCombinationBuilder() {
        this.characters = null;
    }

    public ProposedCombinationBuilder characters(String characters) {
        this.characters = characters;
        return this;
    }

    public ProposedCombination build() {
        assert(this.characters != null);
        assert(this.characters.length() == Combination.getWidth());
        ProposedCombination proposedCombination = new ProposedCombination();
        for(int i=0; i<this.characters.length(); i++){
            Color color = Color.getInstance(this.characters.charAt(i));
            assert(color!=null);
            proposedCombination.colors[i] = color;
        }
        return proposedCombination;
    }

}