import java.util.ArrayList;
import java.util.List;

class ProteinTranslator {

    List<String> translate(String rnaSequence) {
        List<String> result = new ArrayList<>();
        int length = rnaSequence.length();
        for (int i = 0; i < length; i+=3) {
            String codon = rnaSequence.substring(i, i+3);
            if (codon.equals("UAA") || codon.equals("UAG") || codon.equals("UGA")) break;

            if (codon.equals("AUG")) {
                result.add("Methionine");
            }
            if (codon.equals("UUU") || codon.equals("UUC")) {
                result.add("Phenylalanine");
            }
            if (codon.equals("UUA") || codon.equals("UUG")) {
                result.add("Leucine");
            }
            if (codon.equals("UCU") || codon.equals("UCC") || codon.equals("UCA") || codon.equals("UCG")) {
                result.add("Serine");
            }
            if (codon.equals("UAU") || codon.equals("UAC")) {
                result.add("Tyrosine");
            }
            if (codon.equals("UGU") || codon.equals("UGC")) {
                result.add("Cysteine");
            }
            if (codon.equals("UGG")) {
                result.add("Tryptophan");
            }
        }
        return result;
    }
}