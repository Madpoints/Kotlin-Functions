package rsk

fun main(args: Array<String>) {
    val text = "With    multiple \t whitespace"
    println(replaceMultipleWhiteSpace(text))
    println(text.replaceMultipleWhiteSpaceEx())
}

fun max(a: Int, b: Int): Int = if (a > b) a else b

fun replaceMultipleWhiteSpace(value: String) : String {
    var regex = Regex("\\s+")
    return regex.replace(value, " ")
}

fun String.replaceMultipleWhiteSpaceEx() : String {
    var regex = Regex("\\s+")
    return regex.replace(this, " ")
}