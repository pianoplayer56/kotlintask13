fun main() {
    println("Вы постоянный клиент? (введите true или false)")
    val isMeloman: Boolean = readLine().toBoolean()
    println("Введите стоимость заказа: ")
    val cost: Int = readLine()!!.toInt()
    val result: Double = (if (isMeloman) 0.99 else 1.0) *
            when (cost) {
                in 0..1000 -> cost.toDouble()
                in 1001..10000 -> (cost - 100).toDouble()
                else -> cost * 0.95
            }
    println(
        """Постоянный клиент: ${if (isMeloman) "да" else "нет"}
        |Стоимость заказа с учетом скидки: $result рублей.
    """.trimMargin()
    )

}


