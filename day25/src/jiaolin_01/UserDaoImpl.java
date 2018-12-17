package jiaolin_01;

/**
 * @Auther: Joinlin
 * @Descriptional:
 * @Date: Create in 10:54 2018/7/2
 * @Modify By:
 */
public class UserDaoImpl implements UserDao {
	@Override
	public void add() {
		System.out.println("增加");
	}

	@Override
	public void delete() {
		System.out.println("删除");
	}

	@Override
	public void update() {
		System.out.println("修改");
	}

	@Override
	public void find() {
		System.out.println("查询");
	}
}
