package cn.zhipingok.sketch.dao.iml;

import cn.zhipingok.sketch.common.GenericJpaDaoImpl;
import cn.zhipingok.sketch.common.NormalGenericJpaDaoImple;
import cn.zhipingok.sketch.dao.SvsInstanceDao;
import cn.zhipingok.sketch.model.SvsInstance;


/***
 *或许spring 提供这的的方式，但我不并推崇。
 * public class SvsInstanceDaoIml extends GenericJpaDaoImpl<SvsInstance,Long> implements SvsInstanceDao {

 }
 */
public class SvsInstanceDaoIml extends NormalGenericJpaDaoImple<SvsInstance,Long> implements SvsInstanceDao {

}
