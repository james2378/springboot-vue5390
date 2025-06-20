
var projectName = '大学生就业服务平台';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
{
        name: '我的收藏',
        url: '../storeup/list.html'
}
]


var indexNav = [

{
	name: '招聘信息',
	url: './pages/zhaopinxinxi/list.html'
}, 
{
	name: '宣讲会',
	url: './pages/xuanjianghui/list.html'
}, 

]

var adminurl =  "http://localhost:8080/springbootua77e/admin/dist/index.html";

var cartFlag = false

var chatFlag = false




var menu = [{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-goods","buttons":["新增","查看","修改","删除","审核","报表"],"menu":"学生","menuJump":"列表","tableName":"xuesheng"}],"menu":"学生管理"},{"child":[{"appFrontIcon":"cuIcon-explore","buttons":["新增","查看","修改","删除","审核"],"menu":"企业","menuJump":"列表","tableName":"qiye"}],"menu":"企业管理"},{"child":[{"appFrontIcon":"cuIcon-link","buttons":["查看","修改","删除","报表","审核"],"menu":"招聘信息","menuJump":"列表","tableName":"zhaopinxinxi"}],"menu":"招聘信息管理"},{"child":[{"appFrontIcon":"cuIcon-flashlightopen","buttons":["新增","查看","修改","删除"],"menu":"岗位","menuJump":"列表","tableName":"gangwei"}],"menu":"岗位管理"},{"child":[{"appFrontIcon":"cuIcon-skin","buttons":["查看","修改","删除","报表","导出"],"menu":"投掷信息","menuJump":"列表","tableName":"touzhixinxi"}],"menu":"投掷信息管理"},{"child":[{"appFrontIcon":"cuIcon-newshot","buttons":["新增","查看","修改","删除"],"menu":"宣讲会","menuJump":"列表","tableName":"xuanjianghui"}],"menu":"宣讲会管理"},{"child":[{"appFrontIcon":"cuIcon-rank","buttons":["查看","删除","报表"],"menu":"学生报名","menuJump":"列表","tableName":"xueshengbaoming"}],"menu":"学生报名管理"},{"child":[{"appFrontIcon":"cuIcon-vipcard","buttons":["查看","删除","报表","审核"],"menu":"企业报名","menuJump":"列表","tableName":"qiyebaoming"}],"menu":"企业报名管理"},{"child":[{"appFrontIcon":"cuIcon-clothes","buttons":["查看","修改","删除","审核","报表"],"menu":"考研信息","menuJump":"列表","tableName":"kaoyanxinxi"}],"menu":"考研信息管理"},{"child":[{"appFrontIcon":"cuIcon-vip","buttons":["查看","修改","删除","报表"],"menu":"录用通知","menuJump":"列表","tableName":"luyongtongzhi"}],"menu":"录用通知管理"},{"child":[{"appFrontIcon":"cuIcon-similar","buttons":["新增","查看","修改","删除"],"menu":"轮播图管理","tableName":"config"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-similar","buttons":["投掷简历","查看评论","查看"],"menu":"招聘信息列表","menuJump":"列表","tableName":"zhaopinxinxi"}],"menu":"招聘信息模块"},{"child":[{"appFrontIcon":"cuIcon-newshot","buttons":["学生报名","查看"],"menu":"宣讲会列表","menuJump":"列表","tableName":"xuanjianghui"}],"menu":"宣讲会模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-skin","buttons":["查看"],"menu":"投掷信息","menuJump":"列表","tableName":"touzhixinxi"}],"menu":"投掷信息管理"},{"child":[{"appFrontIcon":"cuIcon-rank","buttons":["查看"],"menu":"学生报名","menuJump":"列表","tableName":"xueshengbaoming"}],"menu":"学生报名管理"},{"child":[{"appFrontIcon":"cuIcon-clothes","buttons":["查看","新增"],"menu":"考研信息","menuJump":"列表","tableName":"kaoyanxinxi"}],"menu":"考研信息管理"},{"child":[{"appFrontIcon":"cuIcon-vip","buttons":["查看"],"menu":"录用通知","menuJump":"列表","tableName":"luyongtongzhi"}],"menu":"录用通知管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-similar","buttons":["投掷简历","查看评论","查看"],"menu":"招聘信息列表","menuJump":"列表","tableName":"zhaopinxinxi"}],"menu":"招聘信息模块"},{"child":[{"appFrontIcon":"cuIcon-newshot","buttons":["学生报名","查看"],"menu":"宣讲会列表","menuJump":"列表","tableName":"xuanjianghui"}],"menu":"宣讲会模块"}],"hasBackLogin":"否","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"学生","tableName":"xuesheng"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-link","buttons":["新增","查看","修改","删除","报表","查看评论"],"menu":"招聘信息","menuJump":"列表","tableName":"zhaopinxinxi"}],"menu":"招聘信息管理"},{"child":[{"appFrontIcon":"cuIcon-flashlightopen","buttons":["新增","查看"],"menu":"岗位","menuJump":"列表","tableName":"gangwei"}],"menu":"岗位管理"},{"child":[{"appFrontIcon":"cuIcon-skin","buttons":["查看","审核","报表","录用通知"],"menu":"投掷信息","menuJump":"列表","tableName":"touzhixinxi"}],"menu":"投掷信息管理"},{"child":[{"appFrontIcon":"cuIcon-newshot","buttons":["查看","企业报名"],"menu":"宣讲会","menuJump":"列表","tableName":"xuanjianghui"}],"menu":"宣讲会管理"},{"child":[{"appFrontIcon":"cuIcon-vipcard","buttons":["查看"],"menu":"企业报名","menuJump":"列表","tableName":"qiyebaoming"}],"menu":"企业报名管理"},{"child":[{"appFrontIcon":"cuIcon-vip","buttons":["查看","报表"],"menu":"录用通知","menuJump":"列表","tableName":"luyongtongzhi"}],"menu":"录用通知管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-similar","buttons":["投掷简历","查看评论","查看"],"menu":"招聘信息列表","menuJump":"列表","tableName":"zhaopinxinxi"}],"menu":"招聘信息模块"},{"child":[{"appFrontIcon":"cuIcon-newshot","buttons":["学生报名","查看"],"menu":"宣讲会列表","menuJump":"列表","tableName":"xuanjianghui"}],"menu":"宣讲会模块"}],"hasBackLogin":"是","hasBackRegister":"是","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"企业","tableName":"qiye"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
