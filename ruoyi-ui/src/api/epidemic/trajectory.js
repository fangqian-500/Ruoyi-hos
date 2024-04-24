import request from '@/utils/request'

// 查询行动轨迹列表
export function listTrajectory(query) {
  return request({
    url: '/epidemic/trajectory/list',
    method: 'get',
    params: query
  })
}

// 查询行动轨迹详细
export function getTrajectory(id) {
  return request({
    url: '/epidemic/trajectory/' + id,
    method: 'get'
  })
}

// 新增行动轨迹
export function addTrajectory(data) {
  return request({
    url: '/epidemic/trajectory',
    method: 'post',
    data: data
  })
}

// 修改行动轨迹
export function updateTrajectory(data) {
  return request({
    url: '/epidemic/trajectory',
    method: 'put',
    data: data
  })
}

// 删除行动轨迹
export function delTrajectory(id) {
  return request({
    url: '/epidemic/trajectory/' + id,
    method: 'delete'
  })
}
