package models;

public class AnagramModel {

        private String anagram;

        public AnagramModel(String anagram) {
            this.anagram = anagram;
        }

        public String getAnagrama() {
            return anagram;
        }

        public void setAnagrama(String anagram) {
            this.anagram = anagram;
        }

        @Override
        public String toString() {
            return this.anagram;
        }

}

//  Víctor Vanaclocha Cebrián