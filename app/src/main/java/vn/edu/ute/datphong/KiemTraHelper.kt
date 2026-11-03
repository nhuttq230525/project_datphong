package vn.edu.ute.datphong

object KiemTraHelper {

    fun kiemTraHoTen(hoTen: String): Boolean {
        return Regex(
            "^[\\p{L}]+(?: [\\p{L}]+)+$"
        ).matches(hoTen.trim())
    }

    fun kiemTraSdt(sdt: String): Boolean {
        return Regex("^0[39][0-9]{8}$")
            .matches(sdt.trim())
    }

    fun kiemTraEmail(email: String): Boolean {
        return Regex(
            "^[A-Za-z][A-Za-z0-9._]{2,29}@gmail\\.com$"
        ).matches(email.trim())
    }

    fun kiemTraNgay(ngay: String): Boolean {
        return Regex(
            "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/(202[6-9])$"
        ).matches(ngay.trim())
    }
}