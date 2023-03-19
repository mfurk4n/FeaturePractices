package stringfunc;


import java.util.function.Function;

class UpperCaseTransformer implements Function<String, String> {

    @Override
    public String apply(String s) {
        return s.toUpperCase();
    }
}

public class TransformIndent {
    public static void main(String[] args) {
        String name = "Furkan";
        String nameUpper = name.transform(new UpperCaseTransformer());
        System.out.println(nameUpper);
        System.out.println(name.indent(3));

    }


}
