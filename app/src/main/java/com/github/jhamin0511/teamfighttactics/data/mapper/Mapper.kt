package com.github.jhamin0511.teamfighttactics.data.mapper

interface Mapper<DTO, VO> {

  fun toVo(dto: DTO): VO

  fun toVos(dtos: List<DTO>): List<VO>

}
