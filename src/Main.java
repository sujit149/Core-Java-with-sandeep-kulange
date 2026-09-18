
void main() throws IOException {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    String json = """
{
    "name": "Sujit",
    "age": 30
}
""";

    System.out.println(json);
    InputStream is = new ByteArrayInputStream(json.getBytes(StandardCharsets.UTF_8));
    System.out.println(is);

    InputStreamReader reader =
            new InputStreamReader(
                    is,
                    StandardCharsets.UTF_8
            );

    BufferedReader bufferedReader =
            new BufferedReader(reader);


    int c;
    while((c = bufferedReader.read()) != -1) {
        System.out.print((char) c);
    }
}
