
public class Main {

    public static void main(String[] args) {
        String[] roles = new String[] {"Городничий","Аммос Федорович","Артемий Филиппович","Лука Лукич","Аммос Левый"};
        String[] textLines = new String[] {"Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор."
                ,"Аммос Федорович: Как ревизор?"
                ,"Артемий Филиппович: Как ревизор?"
                ,"Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем."
                ,"Аммос Федорович: Вот те на!"
                ,"Артемий Филиппович: Вот не было заботы, так подай!"
                ,"Лука Лукич: Господи боже! еще и с секретным предписаньем!"};
        StringBuilder result = new StringBuilder();
        int regexLength;
        for (int i=0;i<roles.length;i++) {
            //ищем строки только нужной роли
            String regex = roles[i]+":";
            result.append(regex+'\n');
            regexLength = regex.length();
            for (int j=0;j<textLines.length;j++) {
                if (textLines[j].startsWith(regex)) {
                    result.append(""+(j+1)+")"+ textLines[j].substring(regexLength)+'\n');
                }
            }
            result.append('\n');
        }
        result.toString();
        System.out.println("fd");
    }
}
