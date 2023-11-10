package ma.enset;

import ma.enset.template.Template;
import ma.enset.template.TemplateImpl1;
import ma.enset.template.TemplateImpl2;

public class Demo {
    public static void main(String[] args) {
        Template template= new TemplateImpl1();
        System.out.println(template.operationTemplate("tets"));
        Template template2= new TemplateImpl2();
        System.out.println(template2.operationTemplate("tets"));
    }
}
