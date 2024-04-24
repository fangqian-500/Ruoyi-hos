import request from '@/utils/request'

// 查询预约管理列表
export function listReserve(query) {
  return request({
    url: '/epidemic/reserve/list',
    method: 'get',
    params: query
  })
}

// 查询预约管理详细
export function getReserve(id) {
  return request({
    url: '/epidemic/reserve/' + id,
    method: 'get'
  })
}

// 新增预约管理
export function addReserve(data) {
  return request({
    url: '/epidemic/reserve',
    method: 'post',
    data: data
  })
}

// 修改预约管理
export function updateReserve(data) {
  return request({
    url: '/epidemic/reserve',
    method: 'put',
    data: data
  })
}

// 删除预约管理
export function delReserve(id) {
  return request({
    url: '/epidemic/reserve/' + id,
    method: 'delete'
  })
}
