<#assign className = table.className>   
<#assign classNameLower = className?uncap_first> 
package ${basepackage}.${subpackage}.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import org.apache.ibatis.type.Alias;
<#assign importDate = false>
<#assign importString = false>
<#assign importBigdecimal = false>

<#list table.columns as column>
		<#if column.javaType.simpleName == "Date" && importDate == false>
import java.util.Date;
				<#assign importDate = true>
				<#continue>
		</#if>
		<#if column.javaType.simpleName == "BigDecimal" && importBigdecimal == false>
import java.math.BigDecimal;
				<#assign importBigdecimal = true>
				<#continue>
		</#if>
</#list>
import lombok.Data;
import java.io.Serializable;

/**
 * ${table.remarks}
 *
 * @author miller
 * @since ${.now?string["yyyy/MM/dd"]}
 * @since 1.0.0
 */
<#list table.columns as column>
<#if column.pk>
<#assign pkType = column.javaType.simpleName>   
</#if>
</#list>
@Alias("${classNameLower}DO")
@Data
@TableName("${table.sqlName}")
public class ${className}DO implements Serializable{

	<#list table.columns as column>
	<#if column.remarks??>
	<#if column.remarks!="">
	/**
	 * ${column.remarks}
	 */
	</#if>
	</#if>
	<#if column.pk>
	@TableId(type = IdType.AUTO)
	<#elseif column.sqlName=='updated_by' || column.sqlName=='updated_time'>
	@TableField(value = "${column.sqlName}", fill = FieldFill.UPDATE)
	<#elseif column.sqlName=='created_by' || column.sqlName=='created_time'>
	@TableField(value = "${column.sqlName}", fill = FieldFill.INSERT)
	<#else>
    @TableField("${column.sqlName}")
	</#if>
	private ${column.javaType.simpleName} ${column.columnNameLower};

	</#list>
}

