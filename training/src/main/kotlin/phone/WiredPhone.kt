package com.qpay.phone

data class WiredPhone(val number: Int): Phone {
    override fun ring(number: Int) {
        print("\ni'm calling at $number\n")
    }
}