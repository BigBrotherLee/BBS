package indi.bigbrotherlee.bbs.dao;

import java.util.List;

import indi.bigbrotherlee.bbs.entity.Tag;

public interface TagDAO {
	final String SUCCESS="SUCCUSS";
	/**
	 * 改变用户标签的检查状态
	 * @return 
	 */
	public boolean changeCheak();
	/**
	 * 提升为系统标签
	 * @return 是否成功
	 */
	public boolean upToSystemTag();
	/**
	 * 创建一个标签
	 * @param tag
	 * @return 成功返回SUCCESS
	 */
	public String ctreateTag(Tag tag);
	/**
	 * 删除一个标签
	 * @param tag要删除的标签
	 * @return 是否删除成功
	 */
	public boolean deleteTag(Tag tag);
	/**
	 *	更新标签的信息
	 * @param tag更新信息后的标签
	 * @return 是否更新成功
	 */
	public boolean updateTag(Tag tag);
	/**
	 * 匹配一个符合条件的标签列表
	 * @param key条件
	 * @return 标签list
	 */
	public List<Tag> getTags(String key);
	/**
	 * 得到一个标签
	 * @param tag条件保存在这个对象中
	 * @return 得到的标签
	 */
	public Tag getTag(Tag tag);
	
}
