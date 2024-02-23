package com.qpay.phone

data class SmartPhone(val number: Int, val name: String) : Phone {

    override fun ring(number: Int) {
        print("\nMy name ${this.name}, my number ${this.number} and i'm calling at $number\n")
    }
}