package com.qpay

import com.qpay.phone.Phone
import com.qpay.phone.SmartPhone
import com.qpay.phone.WiredPhone

fun ringFromEveryPhones(listSmartPhones: List<Phone>, number: Int): Int {
    for (smartPhone in listSmartPhones) {
        println(smartPhone.ring(number))
    }
    return listSmartPhones.size
}

fun typeOfPhone(phone: Any) {
    when (phone) {
        is SmartPhone -> println("\nIt's smartPhone\n")
        is WiredPhone -> println("\nIt's wiredPhone\n")
    }
}

fun main() {
    val number: Int = 12345
    val name = "Roma"

    val smartPhone: Phone = SmartPhone(number, name)
    val wiredPhone: Phone = WiredPhone(number)

    val anotherNumber = 98765
    smartPhone.ring(anotherNumber)
    wiredPhone.ring(anotherNumber)

    val listSmartPhones: MutableList<Phone> = mutableListOf()
    for (i in 1..10) {
        listSmartPhones.add(SmartPhone(number + i, name + i))
    }
    ringFromEveryPhones(listSmartPhones, anotherNumber)

    typeOfPhone(smartPhone)
    typeOfPhone(wiredPhone)
}