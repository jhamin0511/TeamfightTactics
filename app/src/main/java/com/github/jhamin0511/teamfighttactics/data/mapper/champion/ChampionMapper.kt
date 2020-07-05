package com.github.jhamin0511.teamfighttactics.data.mapper.champion

import com.github.jhamin0511.teamfighttactics.data.dto.champion.ChampionDto
import com.github.jhamin0511.teamfighttactics.data.mapper.Mapper
import com.github.jhamin0511.teamfighttactics.data.vo.champion.ChampionVo

class ChampionMapper : Mapper<ChampionDto, ChampionVo> {

  override fun toVo(dto: ChampionDto): ChampionVo {
    return ChampionVo(
      dto.champion.imageRes,
      dto.champion.nameRes,
      dto.cost.color,
      dto.cost.value,
      dto.traits.map { it.imageRes }.toList()
    )
  }

  override fun toVos(dtos: List<ChampionDto>): List<ChampionVo> {
    return dtos.map { toVo(it) }
  }

}
