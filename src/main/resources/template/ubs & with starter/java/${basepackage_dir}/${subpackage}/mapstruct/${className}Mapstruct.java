<#assign className = table.className>
<#assign classNameLower = className?uncap_first>
package ${basepackage}.${subpackage}.mapstruct;
import ${basepackage}.${subpackage}.entity.${className}DO;
import ${basepackage}.${subpackage}.dto.${className}DTO;
import ${basepackage}.${subpackage}.vo.${className}VO;
import com.udun.web.mapstruct.EvolveMapstruct;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
 * @author miller
 * @since ${.now?string["yyyy/MM/dd"]}
 * @since 1.0.0
 */
@Mapper(componentModel = "spring", uses = {}, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ${className}Mapstruct extends EvolveMapstruct<${className}DO, ${className}DTO, ${className}VO> {
}