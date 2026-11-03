import vn.edu.ute.datphong.data.DuLieuMau
import vn.edu.ute.datphong.model.LoaiPhong

object DatPhongHelper {
    fun timLoaiPhong(ma: String): LoaiPhong? {
        return DuLieuMau.dsLoaiPhong.find {
            it.ma.equals(ma.trim(), ignoreCase = true)
        }
    }

    fun hopLeSoKhach(
        loai: LoaiPhong,
        soKhach: Int
    ): Boolean {
        return soKhach in 1..(loai.sucChua + 2)
    }
    fun tinhTienPhong_23115141122114(
        loai: LoaiPhong,
        soDem: Int,
        soKhach: Int
    ): Long {

        if (soDem < 1 || !hopLeSoKhach(loai, soKhach)) {
            return 0L
        }

        var tienPhong = loai.giaMotDem * soDem

        if (soDem >= 3) {